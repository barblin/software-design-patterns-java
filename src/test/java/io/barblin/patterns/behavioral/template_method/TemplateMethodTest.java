package io.barblin.patterns.behavioral.template_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodTest {

    @Test
    void shouldPerformBikeChecklistWithIssues() {
        VehicleServiceTemplate template = new BikeService();

        VehicleServiceTemplate.Report report = template.performChecklist(new Bike(2, 2, 2));
        assertTrue(report.containsCritical());
        assertEquals(3, report.issues().size());
    }

    @Test
    void shouldPerformBikeChecklistWithoutIssues() {
        VehicleServiceTemplate template = new BikeService();

        VehicleServiceTemplate.Report report = template.performChecklist(new Bike(3, 3, 3));
        assertFalse(report.containsCritical());
        assertEquals(0, report.issues().size());
    }

    @Test
    void shouldPerformCarChecklistWithIssues() {
        VehicleServiceTemplate template = new CarService();

        VehicleServiceTemplate.Report report = template.performChecklist(new Car(2, 2, 2, 2));
        assertTrue(report.containsCritical());
        assertEquals(4, report.issues().size());
    }

    @Test
    void shouldPerformCarChecklistWithoutIssues() {
        VehicleServiceTemplate template = new CarService();

        VehicleServiceTemplate.Report report = template.performChecklist(new Car(3, 3, 3, 3));
        assertFalse(report.containsCritical());
        assertEquals(0, report.issues().size());
    }
}