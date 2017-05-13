package com.example.bard.courseblackmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class OwnedClass extends AppCompatActivity {

    private List<CourseInformation> courseInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owned_class);
        initCourseInformation();
        CourseInformationAdapter adapter = new CourseInformationAdapter(OwnedClass.this,
                R.layout.course_item, courseInfoList);
        ListView listView = (ListView) findViewById(R.id.owned_course_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(OwnedClass.this, FunctionActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initCourseInformation()
    {
        CourseInformation sample1 = new CourseInformation(
                    "美国文化概览", "时间：周二 五六节", "授课老师：Mike", 2);
        courseInfoList.add(sample1);
        CourseInformation sample2 = new CourseInformation(
                    "乒乓球", "时间：周二 一二节", "授课老师：彭芳", 1);
        courseInfoList.add(sample2);
    }
}
