package com.example.forest.quickguessv2.DBModule;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;

@Database(entities = {User.class,QuestionCategory.class,Questions.class},version = 1)
public abstract class MyAppDB extends RoomDatabase
{
    public abstract MyDao myDao();
    public abstract CategoriesQuestionDao categoriesQuestionDao();
    public abstract QuestionsDao questionsDao();

}
