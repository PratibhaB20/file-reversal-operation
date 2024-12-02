package org.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class FileContentReverserTest {

    @Test
    public void testProcessFile()  {
        // Mock dependencies
        FileContentReverser reverser = Mockito.spy(FileContentReverser.class);

        String mockInputContent = "ABC";
        String expectedReversedContent = "CBA";

        doReturn(mockInputContent).when(reverser).readFile("input.txt");
        doNothing().when(reverser).writeFile("output.txt", expectedReversedContent);

        // Execute the processing
        reverser.processFile("input.txt", "output.txt");

        // Verify interactions
        verify(reverser, times(1)).readFile("input.txt");
        verify(reverser, times(1)).writeFile("output.txt", expectedReversedContent);
    }

}
