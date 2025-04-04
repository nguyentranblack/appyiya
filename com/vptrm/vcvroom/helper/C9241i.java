package com.vptrm.vcvroom.helper;

import com.netease.nimlib.sdk.chatroom.model.ChatRoomMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C14588m;
import kotlin.collections.C14596u;
import kotlin.jvm.internal.AbstractC14656n;

/* renamed from: com.vptrm.vcvroom.helper.i */
/* loaded from: classes3.dex */
public final class C9241i {

    /* renamed from: a */
    public static final C9241i f20250a = new C9241i();

    /* renamed from: b */
    public static List f20251b;

    /* renamed from: c */
    public static ChatRoomMessage f20252c;

    /* renamed from: a */
    public final List m20619a() {
        if (f20251b == null) {
            m20617c();
        }
        List list = f20251b;
        if (list == null) {
            return C14588m.m8523k();
        }
        return list;
    }

    /* renamed from: b */
    public final ChatRoomMessage m20618b() {
        return f20252c;
    }

    /* renamed from: c */
    public final void m20617c() {
        f20251b = new ArrayList();
    }

    /* renamed from: d */
    public final void m20616d(List newList) {
        AbstractC14656n.m8377g(newList, "newList");
        f20251b = C14596u.m8465q0(newList);
    }

    /* renamed from: e */
    public final void m20615e(ChatRoomMessage chatRoomMessage) {
        f20252c = chatRoomMessage;
    }
}
