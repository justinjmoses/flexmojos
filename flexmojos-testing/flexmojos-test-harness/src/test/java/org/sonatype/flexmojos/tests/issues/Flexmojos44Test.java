/**
 *  Copyright 2008 Marvin Herman Froeder
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */
package org.sonatype.flexmojos.tests.issues;

import java.io.File;
import java.io.IOException;

import org.apache.maven.it.VerificationException;
import org.testng.annotations.Test;

public class Flexmojos44Test
    extends AbstractIssueTest
{

    @Test( timeOut = 360000, expectedExceptions = { VerificationException.class } )
    public void flexmojos44()
        throws VerificationException, IOException
    {
        /*
         * test template will throw an exception locking flashplayer. Flexmojos should detect that and kill flashplayer
         * automatically
         */
        File testDir = getProject( "/issues/flexmojos-44" );
        test( testDir, "install" );
    }

}