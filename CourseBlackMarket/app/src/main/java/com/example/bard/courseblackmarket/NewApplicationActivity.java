package com.example.bard.courseblackmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NewApplicationActivity extends AppCompatActivity {

    private List<CourseInformation> courseInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_application);
        initCourseInformation();
        CourseInformationAdapter adapter = new CourseInformationAdapter(NewApplicationActivity.this,
                R.layout.course_item, courseInfoList);
        ListView listView = (ListView) findViewById(R.id.course_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(NewApplicationActivity.this, OwnedClass.class);
                startActivity(intent);
            }
        });
    }

    private void initCourseInformation()
    {
        for (int i = 0; i < 3; ++i)
        {
            CourseInformation eng_pron = new CourseInformation(
                    "高级英语口语", "时间：周三 五六节", "授课老师：Keturah Hafer", 2);
            courseInfoList.add(eng_pron);
            CourseInformation taichi = new CourseInformation(
                    "太极拳", "时间：周二 一二节", "授课老师：彭芳", 1);
            courseInfoList.add(taichi);
            CourseInformation tennis = new CourseInformation(
                    "网球", "时间：周四 一二节", "授课老师：李毅", 1);
            courseInfoList.add(tennis);
        }
    }
}
