<!DOCTYPE html>
<html>
<head>
  <meta charset='utf-8' />
  <link href='https://cdn.jsdelivr.net/npm/fullcalendar@6.1.8/main.min.css' rel='stylesheet' />
  <script src='https://cdn.jsdelivr.net/npm/fullcalendar@6.1.8/main.min.js'></script>
  <script>
    document.addEventListener('DOMContentLoaded', function() {
      const calendarEl = document.getElementById('calendar');

      const calendar = new FullCalendar.Calendar(calendarEl, {
        initialView: 'dayGridMonth',
        selectable: true,
        editable: true,
        headerToolbar: {
          left: 'prev,next today',
          center: 'title',
          right: 'dayGridMonth,timeGridWeek,timeGridDay'
        },
        events: '/eventList.do',

        select: function(info) {
          const title = prompt('Event Title:');
          if (title) {
            fetch('/addEvent.do', {
              method: 'POST',
              headers: {
                'Content-Type': 'application/json'
              },
              body: JSON.stringify({
                title: title,
                startDate: info.startStr,
                endDate: info.endStr,
                allDay: info.allDay ? 'Y' : 'N'
              })
            })
            .then(res => res.json())
            .then(data => {
              if (data.result === 'success') {
                calendar.refetchEvents();
              } else {
                alert('일정 등록 실패');
              }
            });
          }
          calendar.unselect();
        },

        eventClick: function(info) {
          if (confirm('삭제하시겠습니까?')) {
            fetch('/removeEvent.do?id=' + info.event.id, {
              method: 'POST'
            })
            .then(res => res.json())
            .then(data => {
              if (data.result === 'success') {
                info.event.remove();
              } else {
                alert('삭제 실패');
              }
            });
          }
        }
      });

      calendar.render();
    });
  </script>
  <style>
    body {
      margin: 40px 10px;
      padding: 0;
      font-family: Arial, sans-serif;
    }
    #calendar {
      max-width: 1100px;
      margin: 0 auto;
    }
  </style>
</head>
<body>
  <div id='calendar'></div>
</body>
</html>
