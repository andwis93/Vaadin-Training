package com.example.application.views;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route(value = "dashboard", layout = MainLayout.class)
@PageTitle("Dashboard | Vaadin CRM")
@PermitAll
public class DashboardView extends VerticalLayout {

//    private CrmService service;
//
//    public DashboardView(CrmService service) {
//        this.service = service;
//        addClassName("dashboard-view");
//        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
//        add(getContactStats(), getCompanyChart());
//    }
//
//    private Component getContactStats() {
//        Span stats = new Span(service.countContacts() + " conatacts");
//        stats.addClassNames("text-xl", "mt-m");
//        return stats;
//    }
//
//    private Component getCompanyChart() {
//        Chart chart = new Chart(ChartType.PIE);
//
//        DataSeries dataSeries = new DataSeries();
//        service.findAllCompanies().forEach(company -> {
//            dataSeries.add(new DataSeriesItem(company.getName(), company.getEmployeeCount()));
//        });
//        chart.getConfiguration().setSeries(dataSeries);
//        return chart;
//    }

}
