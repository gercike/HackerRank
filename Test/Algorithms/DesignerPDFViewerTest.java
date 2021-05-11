package Algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignerPDFViewerTest {

    @Test
    void designerPdfViewer() {
        assertEquals(9, DesignerPDFViewer.designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, "abc"));
        assertEquals(28, DesignerPDFViewer.designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7}, "zaba"));
    }
}