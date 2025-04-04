package com.vptrm.vcvroom.helper;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vptrm.common.entity.LoginEntity;
import com.vptrm.common.helper.C8923p;
import com.vptrm.vcvroom.app.App;
import kotlin.jvm.internal.AbstractC14656n;

/* renamed from: com.vptrm.vcvroom.helper.c */
/* loaded from: classes3.dex */
public final class C9198c {

    /* renamed from: a */
    public static final C9198c f20173a = new C9198c();

    /* renamed from: b */
    public static FirebaseAnalytics f20174b;

    /* renamed from: c */
    public static boolean f20175c;

    /* renamed from: a */
    public final void m20708a(Context context) {
        try {
            if (!f20175c) {
                if (context != null) {
                    f20174b = FirebaseAnalytics.getInstance(context);
                }
                f20175c = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m20707b(String eventId, String eventName) {
        AbstractC14656n.m8377g(eventId, "eventId");
        AbstractC14656n.m8377g(eventName, "eventName");
        try {
            if (f20175c) {
                Bundle bundle = new Bundle();
                bundle.putString("item_id", eventId);
                bundle.putString("item_name", eventName);
                LoginEntity m21787g = C8923p.m21789e().m21787g();
                if (m21787g != null) {
                    m20706c(String.valueOf(m21787g.getUserNumber()));
                }
                FirebaseAnalytics firebaseAnalytics = f20174b;
                if (firebaseAnalytics != null) {
                    firebaseAnalytics.m30848a(eventId, bundle);
                    return;
                }
                return;
            }
            m20708a(App.f14383A.m21182a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public final void m20706c(String userId) {
        AbstractC14656n.m8377g(userId, "userId");
        try {
            FirebaseAnalytics firebaseAnalytics = f20174b;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.m30847b(userId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
