package net.fercanet.LNM.test;

import net.fercanet.LNM.MainMenu;
import com.robotium.solo.Solo;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import java.io.*;
import android.test.ActivityInstrumentationTestCase2;

public class fileName9 extends ActivityInstrumentationTestCase2<MainMenu>
{
private Solo solo;

@SuppressLint("NewApi")
public fileName(){
super(MainMenu.class);
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
// EnterText-TestAction-In-TestState
solo.enterText(1,"sb wang dong");

// Click-TestAction-In-TestState
solo.clickOnTextView("text1");

// Drag-TestAction-In-TestState
solo.drag((float)1.1, (float)81.24607,(float)2.2,(float)410.54095,5);

// Drag-TestAction-In-TestState
solo.drag((float)11.1, (float)15.568158,(float)12.2,(float)14.731125,5);

// Click-TestAction-In-TestState
solo.clickOnMenuItem("Item1");

solo.sleep(1000);

// Assert-Text
boolean test1 = solo.searchText("Note 1 test");

boolean test_result;
test_result = test1;
// Assert-Text
boolean test2 = solo.searchText("Note 2 test");

test_result = test_result||test2;

// Assert-Image
solo.takeScreenshot("pic");
try {
if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
//获得SD卡对应的存储目录
File sdCardDir = Environment.getExternalStorageDirectory();
//获取指定文件对应的输入流
FileInputStream fis = new FileInputStream(sdCardDir.getCanonicalPath()+/Robotium-ScreenShots/"pic");
}
} catch (Exception e) {
e.printStackTrace();
}
Bitmap bitmap = BitmapFactory.decodeStream(fis);
int color = bitmap.getPixel(12,26);
boolean test3 = (color+"").equals("124");

test_result = test_result&&test3;

assertTrue("Test: Failed.", test_result);
}
/*--------------------------------*/
}
