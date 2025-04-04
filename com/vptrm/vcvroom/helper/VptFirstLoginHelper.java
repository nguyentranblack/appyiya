package com.vptrm.vcvroom.helper;

import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import android.text.TextUtils;
import com.blankj.utilcode.util.AbstractC2571f0;
import com.blankj.utilcode.util.AbstractC2595m;
import com.blankj.utilcode.util.C2564c0;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.vptrm.common.helper.C8923p;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;
import p413kd.InterfaceC14536b;

/* loaded from: classes3.dex */
public final class VptFirstLoginHelper {

    /* renamed from: a */
    public static final C9186b f20147a = new C9186b(null);

    /* renamed from: b */
    public static final InterfaceC0178h f20148b = C0179i.m38721a(EnumC0181j.f521a, C9185a.f20149a);

    /* renamed from: com.vptrm.vcvroom.helper.VptFirstLoginHelper$a */
    /* loaded from: classes3.dex */
    public static final class C9185a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9185a f20149a = new C9185a();

        public C9185a() {
            super(0);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final VptFirstLoginHelper invoke() {
            return new VptFirstLoginHelper(null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.VptFirstLoginHelper$b */
    /* loaded from: classes3.dex */
    public static final class C9186b {
        public C9186b() {
        }

        /* renamed from: a */
        public final VptFirstLoginHelper m20737a() {
            return (VptFirstLoginHelper) VptFirstLoginHelper.f20148b.getValue();
        }

        public /* synthetic */ C9186b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    public VptFirstLoginHelper() {
    }

    /* renamed from: c */
    public static final VptFirstLoginHelper m20740c() {
        return f20147a.m20737a();
    }

    /* renamed from: b */
    public final void m20741b() {
        String valueOf = String.valueOf(C8923p.m21789e().m21787g().getId());
        String m36293g = C2564c0.m36298b().m36293g("SP_FIRST_LOGIN_FIRST_ENTER_MAIN_PAGE");
        if (TextUtils.isEmpty(m36293g)) {
            HashMap hashMap = new HashMap();
            hashMap.put(valueOf, Boolean.TRUE);
            C2564c0.m36298b().m36284p("SP_FIRST_LOGIN_FIRST_ENTER_MAIN_PAGE", AbstractC2595m.m36170j(hashMap));
            return;
        }
        Object fromJson = new Gson().fromJson(m36293g, new TypeToken<HashMap<String, Boolean>>() { // from class: com.vptrm.vcvroom.helper.VptFirstLoginHelper$doFirstLoginFlagAsSuccess$loginMap$1
        }.getType());
        AbstractC14656n.m8378f(fromJson, "Gson().fromJson(\n       …}.getType()\n            )");
        HashMap hashMap2 = (HashMap) fromJson;
        hashMap2.put(valueOf, Boolean.TRUE);
        C2564c0.m36298b().m36284p("SP_FIRST_LOGIN_FIRST_ENTER_MAIN_PAGE", AbstractC2595m.m36170j(hashMap2));
    }

    /* renamed from: d */
    public final void m20739d(InterfaceC14536b callback) {
        AbstractC14656n.m8377g(callback, "callback");
        try {
            String valueOf = String.valueOf(C8923p.m21789e().m21787g().getId());
            if (!AbstractC2571f0.m36259d(valueOf)) {
                String m36293g = C2564c0.m36298b().m36293g("SP_FIRST_LOGIN_FIRST_ENTER_MAIN_PAGE");
                if (!TextUtils.isEmpty(m36293g)) {
                    Object fromJson = new Gson().fromJson(m36293g, new TypeToken<HashMap<String, Boolean>>() { // from class: com.vptrm.vcvroom.helper.VptFirstLoginHelper$isFirstLoginToMain$loginMap$1
                    }.getType());
                    AbstractC14656n.m8378f(fromJson, "Gson().fromJson(\n       …e()\n                    )");
                    HashMap hashMap = (HashMap) fromJson;
                    if (hashMap.containsKey(valueOf)) {
                        Object obj = hashMap.get(valueOf);
                        Boolean bool = Boolean.TRUE;
                        if (AbstractC14656n.m8382b(obj, bool)) {
                            callback.onSuccess(bool);
                        } else {
                            callback.onSuccess(Boolean.FALSE);
                        }
                    } else {
                        callback.onSuccess(Boolean.FALSE);
                    }
                } else {
                    callback.onSuccess(Boolean.FALSE);
                }
            }
        } catch (Exception unused) {
            callback.onSuccess(Boolean.FALSE);
        }
    }

    public /* synthetic */ VptFirstLoginHelper(AbstractC14648g abstractC14648g) {
        this();
    }
}
