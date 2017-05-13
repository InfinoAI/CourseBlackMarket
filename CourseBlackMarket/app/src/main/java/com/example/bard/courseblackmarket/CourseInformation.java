package com.example.bard.courseblackmarket;

public class CourseInformation
{
    private String name, time, teacher;
    private int credit;
    public CourseInformation(String _name, String _time, String _teacher, int _credit)
    {
        name = _name; time = _time;
        teacher = _teacher; credit = _credit;
    }
    public String getName()
    {
        return name;
    }
    public String getTime()
    {
        return time;
    }
    public String getTeacher()
    {
        return teacher;
    }
    public int getCredit()
    {
        return credit;
    }
}

