package seedu.duke.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seedu.duke.exceptions.PersonNotFoundException;
import seedu.duke.model.TrackingList;
import seedu.duke.model.person.Person;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.duke.testutil.SamplePersons.JOHN;
import static seedu.duke.testutil.SamplePersons.ALICE;
import static seedu.duke.testutil.SamplePersons.BOB;
import static seedu.duke.testutil.SamplePersons.MARY;

public class TextUiTest {
    TextUi textUi = new TextUi();
    private TrackingList trackingList;

    @BeforeEach
    public void initTrackingList() {
        trackingList = new TrackingList();
    }

    @Test
    public void testConstructor() {
        TrackingList constructedList = new TrackingList(JOHN, MARY, ALICE);
        int actualCurrentCapacity = textUi.getCurrentCapacity(constructedList.listPerson());
        assertTrue(actualCurrentCapacity == 3);
    }

    @AfterEach
    public void clearTrackingList() {
        trackingList.clear();
    }
}
