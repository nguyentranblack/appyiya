package com.vptrm.vcvroom.helper;

import com.blankj.utilcode.util.C2564c0;
import com.vptrm.common.entity.LoginEntity;
import com.vptrm.common.helper.C8923p;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC14656n;
import p413kd.InterfaceC14536b;

/* renamed from: com.vptrm.vcvroom.helper.w */
/* loaded from: classes3.dex */
public final class C9289w {

    /* renamed from: a */
    public static final C9289w f20319a = new C9289w();

    /* renamed from: a */
    public final void m20511a(String redPackId, InterfaceC14536b interfaceC14536b) {
        AbstractC14656n.m8377g(redPackId, "redPackId");
        LoginEntity m21787g = C8923p.m21789e().m21787g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (m21787g != null) {
            m21787g.getUserNumber();
            C2564c0 m36298b = C2564c0.m36298b();
            int userNumber = m21787g.getUserNumber();
            Set m36291i = m36298b.m36291i("VPT_MY_OPEN_RED_PACKAGE_" + userNumber);
            if (m36291i != null && m36291i.size() > 0) {
                linkedHashSet = m36291i;
            }
        }
        if (!linkedHashSet.contains(redPackId)) {
            linkedHashSet.add(redPackId);
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(redPackId);
            }
        }
        C2564c0 m36298b2 = C2564c0.m36298b();
        int userNumber2 = m21787g.getUserNumber();
        m36298b2.m36282r("VPT_MY_OPEN_RED_PACKAGE_" + userNumber2, linkedHashSet);
    }
}
