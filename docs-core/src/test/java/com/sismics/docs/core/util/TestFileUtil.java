package com.sismics.docs.core.util;

import com.google.common.collect.Lists;
import com.google.common.io.Resources;
import com.sismics.docs.core.dao.dto.DocumentDto;
import com.sismics.docs.core.model.jpa.File;
import com.sismics.docs.core.util.format.*;
import com.sismics.util.mime.MimeType;
import com.sismics.util.mime.MimeTypeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

/**
 * Test of the file utilities.
 * 
 * @author bgamard
 */
public class TestFileUtil {
    @Test
    public void extractContentOpenDocumentTextTest() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource("file/document.odt").toURI());
        FormatHandler formatHandler = FormatHandlerUtil.find(MimeTypeUtil.guessMimeType(path, "document.odt"));
        Assert.assertNotNull(formatHandler);
        Assert.assertTrue(formatHandler instanceof OdtFormatHandler);
        String content = formatHandler.extractContent("eng", path);
        Assert.assertTrue(content.contains("Lorem ipsum dolor sit amen."));
    }
    
    @Test
    public void extractContentOfficeDocumentTest() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource("file/document.docx").toURI());
        FormatHandler formatHandler = FormatHandlerUtil.find(MimeTypeUtil.guessMimeType(path, "document.docx"));
        Assert.assertNotNull(formatHandler);
        Assert.assertTrue(formatHandler instanceof DocxFormatHandler);
        String content = formatHandler.extractContent("eng", path);
        Assert.assertTrue(content.contains("Lorem ipsum dolor sit amen."));
    }

    @Test
    public void extractContentPowerpointTest() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource("file/apache.pptx").toURI());
        FormatHandler formatHandler = FormatHandlerUtil.find(MimeTypeUtil.guessMimeType(path, "apache.pptx"));
        Assert.assertNotNull(formatHandler);
        Assert.assertTrue(formatHandler instanceof PptxFormatHandler);
        String content = formatHandler.extractContent("eng", path);
        Assert.assertTrue(content.contains("Scaling"));
    }

    @Test
    public void extractContentPdf() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource("file/udhr.pdf").toURI());
        FormatHandler formatHandler = FormatHandlerUtil.find(MimeTypeUtil.guessMimeType(path, "udhr.pdf"));
        Assert.assertNotNull(formatHandler);
        Assert.assertTrue(formatHandler instanceof PdfFormatHandler);
        String content = formatHandler.extractContent("eng", path);
        Assert.assertTrue(content.contains("All human beings are born free and equal in dignity and rights."));
    }

    @Test
    public void extractContentScannedPdf() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource("file/scanned.pdf").toURI());
        FormatHandler formatHandler = FormatHandlerUtil.find(MimeTypeUtil.guessMimeType(path, "scanned.pdf"));
        Assert.assertNotNull(formatHandler);
        Assert.assertTrue(formatHandler instanceof PdfFormatHandler);
        String content = formatHandler.extractContent("eng", path);
        Assert.assertTrue(content.contains("All human beings are born free and equal in dignity and rights."));
    }
}
