package com.vptrm.vcvroom.utils;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import android.widget.ImageView;
import com.vptrm.vcvroom.R;

/* renamed from: com.vptrm.vcvroom.utils.d */
/* loaded from: classes4.dex */
public class C12832d {
    /* renamed from: a */
    public static boolean m11991a(boolean z, ImageView imageView, EditText editText) {
        boolean z2;
        if (z) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            imageView.setBackgroundResource(R.drawable.icon_vpt_password_hide);
            z2 = false;
        } else {
            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            imageView.setBackgroundResource(R.drawable.icon_vpt_password_show);
            z2 = true;
        }
        editText.setSelection(editText.getText().length());
        return z2;
    }
}
