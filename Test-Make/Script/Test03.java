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

// Drag-TestAction-In-TestState
solo.drag((float)391.58, (float)181.82942,(float)989.74,(float)963.579045);

solo.sleep(1000);

// Assert-Text
boolean test_result = solo.searchText("111");

assertTrue("Test: Failed.", test_result);
}
/*--------------------------------*/
}
