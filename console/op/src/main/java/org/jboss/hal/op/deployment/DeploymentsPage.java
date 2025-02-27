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
package org.jboss.hal.op.deployment;

import jakarta.inject.Inject;

import org.jboss.elemento.router.Page;
import org.jboss.elemento.router.PlaceManager;
import org.jboss.elemento.router.Route;

import elemental2.dom.HTMLElement;

import static java.util.Collections.singletonList;
import static org.jboss.elemento.Elements.h;
import static org.jboss.elemento.Elements.p;
import static org.jboss.elemento.router.Link.link;
import static org.patternfly.component.page.PageMainSection.pageMainSection;
import static org.patternfly.component.text.TextContent.textContent;
import static org.patternfly.style.Brightness.light;

@Route("/deployments")
public class DeploymentsPage implements Page {

    @Inject PlaceManager placeManager;

    @Override
    public Iterable<HTMLElement> elements() {
        return singletonList(pageMainSection().background(light)
                .add(textContent()
                        .add(h(1, "Deployments"))
                        .add(p().textContent("Not yet implemented!"))
                        .add(p().add(link(placeManager, "/").textContent("Home"))))
                .element());
    }
}
