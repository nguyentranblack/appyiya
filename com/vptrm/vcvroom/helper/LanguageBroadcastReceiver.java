package com.vptrm.vcvroom.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.blankj.utilcode.util.AbstractC2603r;
import com.blankj.utilcode.util.C2564c0;
import kotlin.jvm.internal.AbstractC14656n;

/* loaded from: classes3.dex */
public final class LanguageBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (AbstractC14656n.m8382b(str, "android.intent.action.LOCALE_CHANGED")) {
            AbstractC2603r.m36091k("检测到系统语言变化");
            try {
                C2564c0.m36298b().m36280t("VPT_PHONE_SYSTEM_LANGUAGE_CHANGE", true);
            } catch (Exception e) {
                AbstractC2603r.m36091k("检测到系统语言变化异常：" + e);
            }
        }
    }
}
