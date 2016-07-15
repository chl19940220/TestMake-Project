import com.robotium.solo.Solo;
import android.annotation.SuppressLint;
import android.test.ActivityInstrumentationTestCase2;

public class ScriptTest extends ActivityInstrumentationTestCase2<MainActivityName>
{
private Solo solo;

@SuppressLint("NewApi")
public ScriptTest(){
super(MainActivityName.class);
}

@Override
public void setUp() throws Exception { 
 solo = new Solo(getInstrumentation(), getActivity()); 
 }

@Override
public void tearDown() throws Exception { 
 solo.finishOpenedActivities(); 
 }

/*------ Test Core Function ------*/
public void testOnClick()
{
// Click-TestAction-In-TestState
solo.clickOnButton("Training");

// Click-TestAction-In-TestState
solo.clickOnButton("re");

// Click-TestAction-In-TestState
solo.clickOnButton("si");

// Click-TestAction-In-TestState
solo.clickOnButton("mi");

// Click-TestAction-In-TestState
solo.clickOnButton("sol");

// Click-TestAction-In-TestState
solo.clickOnButton("do");

// Click-TestAction-In-TestState
solo.clickOnButton("fa");

// Click-TestAction-In-TestState
solo.clickOnButton("la");

// Click-TestAction-In-TestState
solo.clickOnButton("End Game");

solo.sleep(1000);

// Assert-Text
boolean test_result = solo.searchText("666");

assertTrue("Test: Failed.", test_result);
}
/*--------------------------------*/
}
