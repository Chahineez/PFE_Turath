// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

// Pie Chart Example
//var fct = new com.turath.control.Recherche();
//${pageContext.request.contextPath}/
$.get('${pageContext.request.contextPath}/Dashboard', function(data) {
    alert(data);
	//document.getElementById("data").firstChild.nodeValue = data;
	//$('#data').text(data);
});
var nbMaisons=4;
var nbMonuments=10;
var nbSites=3;
var nbEspaces=2;
//console.log("nb maisons ",nbMaisons);
var exemple = document.getElementById("data");
console.log("data ", $('#data').val());
console.log("exemple ", $('#exemple').val());
var ctx = document.getElementById("myPieChart");
console.log("ctx ", ctx);
//var nbMaisons= $('#nbMaisons').val();
var myPieChart = new Chart(ctx, {
  type: 'pie',
  data: {
	   labels: ["Maisons", "Monuments", "Sites", "Espaces"],
    datasets: [{
      data: [nbMaisons, nbMonuments, nbSites, nbEspaces],
      backgroundColor: ['#28a745','#ffc107', '#007bff' , '#dc3545'],
    }],
  },
});
 