package uk.gov.ukho.jfdi.timesheet;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.time.LocalDate;

@Route
public class MainView extends VerticalLayout {

    public MainView() {

        H1 header = new H1("Timesheet");
        DatePicker datePicker = new DatePicker("For date", LocalDate.now());
        Button startDayButton = new Button("Start the day");
        Button endDayButton = new Button("End the day");
        Button startBreakButton = new Button("Start a break");
        Button endBreakButton = new Button("End the break");

        HorizontalLayout buttonBar = new HorizontalLayout();
        buttonBar.add(startDayButton, startBreakButton, endBreakButton, endDayButton);

        add(header, datePicker, buttonBar);
    }

}
