package org.bee.testcase;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.bee.testcase.comment.CommentTestCase;
import org.bee.testcase.control.ElseForTestCase;
import org.bee.testcase.control.ForTestCase;
import org.bee.testcase.control.IfTestCase;
import org.bee.testcase.control.SwitchTestCase;
import org.bee.testcase.control.WhileTestCase;
import org.bee.testcase.directive.DirectiveSafeOutputTestCase;
import org.bee.testcase.error.InvalidTestCase;
import org.bee.testcase.error.MissErrorTestCase;
import org.bee.testcase.error.NoViableAltTestCase;
import org.bee.testcase.exp.BasicExpTestCase;
import org.bee.testcase.exp.CondtionExpTestCase;
import org.bee.testcase.exp.ExpComplexTestCase;
import org.bee.testcase.exp.SafeOutputTestCase;
import org.bee.testcase.exp.VarRefTestCase;
import org.bee.testcase.ext.FormatTest;
import org.bee.testcase.ext.FunctionTest;
import org.bee.testcase.ext.IncludeFunctionTest;
import org.bee.testcase.ext.LayoutFunctionTest;
import org.bee.testcase.ext.TagTest;
import org.bee.testcase.nat.NativeTestCase;
import org.bee.testcase.nat.NativeTestCase2;
import org.bee.testcase.objref.ComplicatedModelTestCase;
import org.bee.testcase.objref.ObjectRefTest;
import org.bee.testcase.strtemplate.StrTemplateTestCase;
import org.bee.testcase.type.CollectionTestCase;
import org.bee.testcase.type.PrimitiveTestCase;

public class AllTests
{

	public static Test suite()
	{

		TestSuite suite = new TestSuite("Test for org.bee.testcase");
		//$JUnit-BEGIN$
		suite.addTestSuite(CommentTestCase.class);
		suite.addTestSuite(ForTestCase.class);
		suite.addTestSuite(ElseForTestCase.class);

		suite.addTestSuite(IfTestCase.class);
		suite.addTestSuite(SwitchTestCase.class);
		suite.addTestSuite(WhileTestCase.class);

		suite.addTestSuite(InvalidTestCase.class);
		suite.addTestSuite(MissErrorTestCase.class);
		suite.addTestSuite(NoViableAltTestCase.class);

		suite.addTestSuite(BasicExpTestCase.class);
		suite.addTestSuite(CondtionExpTestCase.class);
		suite.addTestSuite(ExpComplexTestCase.class);
		suite.addTestSuite(SafeOutputTestCase.class);
		suite.addTestSuite(VarRefTestCase.class);

		suite.addTestSuite(FunctionTest.class);
		suite.addTestSuite(FormatTest.class);
		suite.addTestSuite(IncludeFunctionTest.class);
		suite.addTestSuite(LayoutFunctionTest.class);
		suite.addTestSuite(TagTest.class);

		suite.addTestSuite(NativeTestCase.class);
		suite.addTestSuite(NativeTestCase2.class);

		suite.addTestSuite(ObjectRefTest.class);
		suite.addTestSuite(ComplicatedModelTestCase.class);

		//hard to test,ignore it
		//		suite.addTestSuite(DivdeZeorTestCase.class);
		//		suite.addTestSuite(JavaErrorTestCase.class);

		suite.addTestSuite(PrimitiveTestCase.class);
		suite.addTestSuite(CollectionTestCase.class);

		suite.addTestSuite(StrTemplateTestCase.class);
		suite.addTestSuite(DirectiveSafeOutputTestCase.class);

		//$JUnit-END$
		return suite;
	}

}
