/*
 *  Copyright 2024 Red Hat
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jboss.hal.op.skeleton;

import org.jboss.elemento.router.Page;
import org.jboss.elemento.router.Place;

import elemental2.dom.HTMLElement;

import static java.util.Collections.singletonList;
import static org.jboss.elemento.Elements.p;
import static org.patternfly.component.page.PageMainSection.pageMainSection;
import static org.patternfly.component.text.TextContent.textContent;
import static org.patternfly.component.title.Title.title;
import static org.patternfly.style.Brightness.light;

public class NotFound implements Page {

    private final Place place;

    public NotFound(Place place) {
        this.place = place;
    }

    @Override
    public Iterable<HTMLElement> elements() {
        return singletonList(pageMainSection()
                .background(light)
                .add(textContent()
                        .add(title(1, "Not Found"))
                        .add(p().textContent("Page " + place.route + " not found")))
                .element());
    }
}
