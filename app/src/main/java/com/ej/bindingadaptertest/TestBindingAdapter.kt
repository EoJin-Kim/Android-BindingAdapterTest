package com.ej.bindingadaptertest

import android.widget.TextView
import androidx.databinding.BindingAdapter

object TestBindingAdapter {

    @JvmStatic
    @BindingAdapter("text_lulu_lala")
    fun setText(view: TextView, text: String) {
        view.text = "$text\n$text"

    }
}