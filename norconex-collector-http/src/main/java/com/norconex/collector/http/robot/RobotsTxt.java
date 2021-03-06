/* Copyright 2010-2013 Norconex Inc.
 * 
 * This file is part of Norconex HTTP Collector.
 * 
 * Norconex HTTP Collector is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Norconex HTTP Collector is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Norconex HTTP Collector. If not, 
 * see <http://www.gnu.org/licenses/>.
 */
package com.norconex.collector.http.robot;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.norconex.collector.http.filter.IURLFilter;

public class RobotsTxt implements Serializable {

    private static final long serialVersionUID = -2203572498193869416L;
    
    public static final float UNSPECIFIED_CRAWL_DELAY = -1;
    
    private final IURLFilter[] filters;
    private final float crawlDelay ;
    
    public RobotsTxt(IURLFilter[] filters) {
        this(filters, UNSPECIFIED_CRAWL_DELAY);
    }
    public RobotsTxt(IURLFilter[] filters, float crawlDelay) {
        super();
        this.filters = ArrayUtils.clone(filters);
        this.crawlDelay = crawlDelay;
    }

    public IURLFilter[] getFilters() {
        return filters;
    }
    
    public float getCrawlDelay() {
        return crawlDelay;
    }
}
