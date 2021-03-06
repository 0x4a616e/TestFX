/*
 * Copyright 2013-2014 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European
 * Commission - subsequent versions of the EUPL (the "Licence"); You may not use this work
 * except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * Licence is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the Licence for the specific language governing permissions
 * and limitations under the Licence.
 */
package org.testfx.cases;

import java.awt.GraphicsEnvironment;

import org.junit.BeforeClass;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;

import static org.junit.Assume.assumeFalse;

public abstract class TestCaseBase extends FxRobot {

    //---------------------------------------------------------------------------------------------
    // STATIC METHODS.
    //---------------------------------------------------------------------------------------------

    @BeforeClass
    public static void baseSetupSpec() throws Exception {
        assumeFalse(
            "Cannot run JavaFX in headless environment",
            GraphicsEnvironment.getLocalGraphicsEnvironment().isHeadlessInstance()
        );
        FxToolkit.registerPrimaryStage();
    }

}
