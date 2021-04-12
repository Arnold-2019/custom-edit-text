package com.example.customedittext

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.textfield.TextInputLayout


class CustomTextInputLayout : TextInputLayout {
    private var mTitleText: String? = null

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {

        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.CustomTextInputLayout, 0, 0)
        val n = typedArray.indexCount
        for (i in 0 until n) {
            val arr = typedArray.getIndex(i)
            when (arr) {
                R.styleable.CustomTextInputLayout_titleText -> mTitleText = typedArray.getString(arr)
                else -> {
                }
            }
        }

        typedArray.recycle()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}
