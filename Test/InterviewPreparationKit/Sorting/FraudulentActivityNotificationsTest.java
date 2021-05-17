package InterviewPreparationKit.Sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FraudulentActivityNotificationsTest {

    @Test
    void activityNotifications() {
        assertEquals(1, FraudulentActivityNotifications.activityNotifications(Arrays.asList(10, 20, 30, 40, 50), 3));
        assertEquals(2, FraudulentActivityNotifications.activityNotifications(Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5), 5));
        assertEquals(0, FraudulentActivityNotifications.activityNotifications(Arrays.asList(1, 2, 3, 4, 4), 4));
    }
}