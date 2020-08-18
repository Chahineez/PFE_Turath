// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

// Pie Chart Example
var ctx = document.getElementById("myPieChart");
var myPieChart = new Chart(ctx, {
  type: 'pie',
  data: {
	   labels: ["Maisons", "Monuments", "Sites", "Espaces"],
    datasets: [{
      data: [50, 45, 23, 20],
      backgroundColor: ['#28a745','#ffc107', '#007bff' , '#dc3545'],
    }],
  },
});
