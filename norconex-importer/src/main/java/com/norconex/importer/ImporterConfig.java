/* Copyright 2010-2013 Norconex Inc.
 * 
 * This file is part of Norconex Importer.
 * 
 * Norconex Importer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Norconex Importer is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Norconex Importer. If not, see <http://www.gnu.org/licenses/>.
 */
package com.norconex.importer;

import java.io.Serializable;

import com.norconex.importer.parser.DefaultDocumentParserFactory;
import com.norconex.importer.parser.IDocumentParserFactory;

/**
 * Importer configuration.
 * @author Pascal Essiembre
 */
public class ImporterConfig implements Serializable {

    private static final long serialVersionUID = -7110188100703942075L;

    private IDocumentParserFactory documentParserFactory = 
            new DefaultDocumentParserFactory();

    private IImportHandler[] preParseHandlers;
    private IImportHandler[] postParseHandlers;
    
    public IDocumentParserFactory getParserFactory() {
        return documentParserFactory;
    }
    public void setParserFactory(IDocumentParserFactory parserFactory) {
        this.documentParserFactory = parserFactory;
    }
    

    public void setPreParseHandlers(IImportHandler... handlers) {
        preParseHandlers = handlers;
    }
    public IImportHandler[] getPreParseHandlers() {
        return preParseHandlers;
    }
    public void setPostParseHandlers(IImportHandler... handlers) {
        postParseHandlers = handlers;
    }
    public IImportHandler[] getPostParseHandlers() {
        return postParseHandlers;
    }
}
