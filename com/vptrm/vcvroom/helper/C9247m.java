package com.vptrm.vcvroom.helper;

import com.blankj.utilcode.util.C2562b0;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: com.vptrm.vcvroom.helper.m */
/* loaded from: classes3.dex */
public final class C9247m {

    /* renamed from: a */
    public static final C9247m f20263a = new C9247m();

    /* renamed from: b */
    public static ArrayList f20264b;

    /* renamed from: c */
    public static long f20265c;

    /* renamed from: d */
    public static int f20266d;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
        r2.add(r8);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m20610a() {
        com.vptrm.vcvroom.entity.TaskOnlineEntity r2;
        java.util.Calendar r2 = java.util.Calendar.getInstance();
        float r4 = r2.get(11) + (r2.get(12) / 60.0f);
        java.util.ArrayList r2 = new java.util.ArrayList();
        java.util.ArrayList r7 = com.vptrm.vcvroom.helper.C9247m.f20264b;
        kotlin.jvm.internal.AbstractC14656n.m8380d(r7);
        java.util.Iterator r7 = r7.iterator();
        while (true) {
            if (!r7.hasNext()) {
                break;
            }
            com.vptrm.vcvroom.entity.TaskOnlineEntity r8 = (com.vptrm.vcvroom.entity.TaskOnlineEntity) r7.next();
            kotlin.jvm.internal.AbstractC14656n.m8380d(r8);
            java.util.Date r9 = com.vptrm.common.utils.C8973b0.m21641w(r8.getBeginTime());
            java.util.Calendar r10 = java.util.Calendar.getInstance();
            r10.setTime(r9);
            float r9 = r10.get(11) + (r10.get(12) / 60.0f);
            java.util.Date r10 = com.vptrm.common.utils.C8973b0.m21641w(r8.getEndTime());
            java.util.Calendar r11 = java.util.Calendar.getInstance();
            r11.setTime(r10);
            float r10 = r11.get(11) + (r11.get(12) / 60.0f);
            if (r10 >= r9) {
                if (r9 <= r4 && r4 <= r10) {
                    r2.add(r8);
                    break;
                }
            } else if ((r9 <= r4 && r4 <= 24.0f) || (0.0f <= r4 && r4 <= r10)) {
                break;
            }
        }
        if (!r2.isEmpty()) {
            r2 = (com.vptrm.vcvroom.entity.TaskOnlineEntity) kotlin.collections.C14596u.m8490R(r2);
        } else {
            r2 = null;
        }
        if (r2 != null) {
            if (com.vptrm.vcvroom.helper.C9247m.f20265c != r2.getTaskId()) {
                com.vptrm.vcvroom.helper.C9247m.f20266d = 0;
            }
            long r2 = r2.getTaskId();
            com.vptrm.vcvroom.helper.C9247m.f20265c = r2;
            com.vptrm.vcvroom.helper.C9247m.f20266d = m20609b(r2) + 1;
            m20608c(com.vptrm.vcvroom.helper.C9247m.f20265c);
            int r2 = com.vptrm.vcvroom.helper.C9247m.f20266d;
            com.blankj.utilcode.util.AbstractC2603r.m36093i("onlineTimeMin:" + r2);
            com.vptrm.library.helper.C9072a.m21420c("UPDATE_ONLINE_TIME", java.lang.Integer.valueOf(com.vptrm.vcvroom.helper.C9247m.f20266d));
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [(r4v0 long), (r1v3 int)] */
    /* renamed from: b */
    public final int m20609b(long j) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1) + calendar.get(2) + calendar.get(5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        sb2.append(i);
        return C2562b0.m36303b(sb2.toString(), 0);
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [(r4v0 long), (r1v3 int)] */
    /* renamed from: c */
    public final void m20608c(long j) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1) + calendar.get(2) + calendar.get(5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        sb2.append(i);
        C2562b0.m36301d(sb2.toString(), f20266d);
    }
}
