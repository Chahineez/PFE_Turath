<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Dashboard</title>
        <link href="dist/css/styles.css" rel="stylesheet" /> 
        <link href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css" rel="stylesheet" crossorigin="anonymous" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed">
        <%@include file="headerDashboardExpert.jsp" %>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid">
                        <h1 class="mt-4">Tableau de bord</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Tableau de bord</li>
                        </ol>

                        <div class="row">
                           
                            <div class="col-lg-6">
                                <div class="card mb-4">
                                    <div class="card-header">
                                        <i class="fas fa-chart-pie mr-1"></i>
                                      Statistiques des éléments patrimoniaux
                                    </div>
                                    <input type="hidden" name="nbMaisons" id="nbMaisons" value="${sessionScope.nbMaisons}" />
          							<input type="hidden" name="nbMonuments" id="nbMonuments" value="${sessionScope.nbMonuments}" />
          							<input type="hidden" name="nbSites" id="nbSites" value="${sessionScope.nbSites}" />
          							<input type="hidden" name="nbEspaces" id="nbEspaces" value="${sessionScope.nbEspaces}" />
                                    
                                    <div class="card-body"><canvas id="myPieChart" width="100%" height="50"></canvas></div>

                                </div>
                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Turath 2020</div>
                            
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="dist/js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="dist/assets/demo/chart-area-demo.js"></script>
        <script src="dist/assets/demo/chart-bar-demo.js"></script>
        <script src="dist/assets/demo/chart-pie-demo.js"></script>
    </body>
</html>
