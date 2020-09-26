package com.example.danciben;

import android.provider.BaseColumns;

public class Words {
    public Words(){

    }
    public static abstract class Word implements BaseColumns{
        public static final String TABLE_NAME="words";//表名 words
        public static final String COLUMN_NAME_WORD="word";//列  单词
        public static final String COLUMN_NAME_MEANING="meaning";//列  意思
        public static final String COLUMN_NAME_SAMPLE="sample";//列   示例
    }
}
