package io.barblin.patterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

class OrgStructureTest {

    @Test
    void iterateOrgStructureShouldSucceed() {
        Manager ceo = createExecutiveBranch();
        ceo.addSubordinate(createTechnologyBranch());
        ceo.addSubordinate(createOperationsBranch());

        Set<Integer> expectedEmployees = new HashSet<>();
        expectedEmployees.add(10);
        expectedEmployees.add(20);
        expectedEmployees.add(11);
        expectedEmployees.add(30);
        expectedEmployees.add(12);
        expectedEmployees.add(13);
        expectedEmployees.add(21);
        expectedEmployees.add(22);
        expectedEmployees.add(23);
        expectedEmployees.add(31);
        expectedEmployees.add(32);
        expectedEmployees.add(33);

        for (Employee employee : ceo) {
            assertTrue(expectedEmployees.remove(employee.showId()));
        }
        assertTrue(expectedEmployees.isEmpty());
    }

    private Manager createExecutiveBranch() {
        Subordinate subordinate1 = new Subordinate(12);
        Subordinate subordinate2 = new Subordinate(13);

        Manager midManagerExecutive = new Manager(11);
        midManagerExecutive.addSubordinate(subordinate1);
        midManagerExecutive.addSubordinate(subordinate2);

        Manager ceo = new Manager(10);
        ceo.addSubordinate(midManagerExecutive);
        return ceo;
    }

    private Manager createTechnologyBranch() {
        Subordinate subordinate1 = new Subordinate(22);
        Subordinate subordinate2 = new Subordinate(23);

        Manager midManager = new Manager(21);
        midManager.addSubordinate(subordinate1);
        midManager.addSubordinate(subordinate2);

        Manager cto = new Manager(20);
        cto.addSubordinate(midManager);
        return cto;
    }

    private Manager createOperationsBranch() {
        Subordinate subordinate1 = new Subordinate(32);
        Subordinate subordinate2 = new Subordinate(33);

        Manager midManager = new Manager(31);
        midManager.addSubordinate(subordinate1);
        midManager.addSubordinate(subordinate2);

        Manager coo = new Manager(30);
        coo.addSubordinate(midManager);
        return coo;
    }
}