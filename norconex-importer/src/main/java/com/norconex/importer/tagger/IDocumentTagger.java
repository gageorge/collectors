package com.norconex.importer.tagger;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;

import com.norconex.commons.lang.meta.Metadata;

/**
 * Tags a document with extra metadata information, or manipulate existing
 * metadata information.
 * @author Pascal Essiembre
 *
 */
public interface IDocumentTagger extends Serializable {

    /**
     * Tags a document with extra metadata information.
     * @param reference document reference (e.g. URL)
     * @param document document
     * @param metadata document metadata
     * @throws IOException problem reading the document
     */
    void tagDocument(String reference, Reader document, Metadata metadata)
            throws IOException;
}