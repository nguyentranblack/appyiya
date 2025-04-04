package com.vptrm.vcvroom.netease;

import android.content.Context;
import android.content.SharedPreferences;
import com.blankj.utilcode.util.AbstractC2585j0;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.netease.nim.uikit.api.NimUIKit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.vptrm.vcvroom.netease.b */
/* loaded from: classes3.dex */
public class C9302b {
    /* renamed from: a */
    public static void m20491a() {
        m20474r("KEY_VIDEO_CHAT_SEARCH_LOG", "");
    }

    /* renamed from: b */
    public static boolean m20490b(String str, boolean z) {
        return m20482j().getBoolean(str, z);
    }

    /* renamed from: c */
    public static boolean m20489c() {
        return m20490b("down_time_toggle", false);
    }

    /* renamed from: d */
    public static boolean m20488d() {
        return m20490b("KEY_EXCEPTION_EXIT_ROOM_OR_RESTART", false);
    }

    /* renamed from: e */
    public static int m20487e(String str, int i) {
        return m20482j().getInt(str, i);
    }

    /* renamed from: f */
    public static String m20486f() {
        return m20481k("KEY_LAST_ENTER_ROOM_ID", "");
    }

    /* renamed from: g */
    public static Integer m20485g() {
        return Integer.valueOf(m20487e("KEY_LAST_ENTER_ROOM_ON_SEAT", -1));
    }

    /* renamed from: h */
    public static List m20484h(String str, Class cls) {
        ArrayList arrayList = new ArrayList();
        String string = m20482j().getString(str, "");
        if (!string.equals("") && string.length() > 0) {
            Gson gson = new Gson();
            Iterator<JsonElement> it = new JsonParser().parse(string).getAsJsonArray().iterator();
            while (it.hasNext()) {
                arrayList.add(gson.fromJson(it.next(), (Class<Object>) cls));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static long m20483i(String str, long j) {
        return m20482j().getLong(str, j);
    }

    /* renamed from: j */
    public static SharedPreferences m20482j() {
        Context applicationContext = AbstractC2585j0.m36226a().getApplicationContext();
        return applicationContext.getSharedPreferences("hochat." + NimUIKit.getAccount(), 0);
    }

    /* renamed from: k */
    public static String m20481k(String str, String str2) {
        return m20482j().getString(str, str2);
    }

    /* renamed from: l */
    public static long m20480l() {
        return m20483i("VIDEO_CHAT_MY_ROOM_ID", -1L);
    }

    /* renamed from: m */
    public static String m20479m() {
        return m20481k("KEY_OPEN_AD_WELCOME", "");
    }

    /* renamed from: n */
    public static boolean m20478n(String str, List list) {
        char c;
        boolean z = true;
        String simpleName = list.get(0).getClass().getSimpleName();
        SharedPreferences.Editor edit = m20482j().edit();
        JsonArray jsonArray = new JsonArray();
        try {
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals("String")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -672261858:
                    if (simpleName.equals("Integer")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2374300:
                    if (simpleName.equals("Long")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 67973692:
                    if (simpleName.equals("Float")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1729365000:
                    if (simpleName.equals("Boolean")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                Gson gson = new Gson();
                                for (int i = 0; i < list.size(); i++) {
                                    jsonArray.add(gson.toJsonTree(list.get(i)));
                                }
                            } else {
                                for (int i2 = 0; i2 < list.size(); i2++) {
                                    jsonArray.add((Integer) list.get(i2));
                                }
                            }
                        } else {
                            for (int i3 = 0; i3 < list.size(); i3++) {
                                jsonArray.add((String) list.get(i3));
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            jsonArray.add((Float) list.get(i4));
                        }
                    }
                } else {
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        jsonArray.add((Long) list.get(i5));
                    }
                }
            } else {
                for (int i6 = 0; i6 < list.size(); i6++) {
                    jsonArray.add((Boolean) list.get(i6));
                }
            }
            edit.putString(str, jsonArray.toString());
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        edit.apply();
        return z;
    }

    /* renamed from: o */
    public static void m20477o(String str, boolean z) {
        SharedPreferences.Editor edit = m20482j().edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    /* renamed from: p */
    public static void m20476p(String str, int i) {
        SharedPreferences.Editor edit = m20482j().edit();
        edit.putInt(str, i);
        edit.commit();
    }

    /* renamed from: q */
    public static void m20475q(String str, Long l) {
        SharedPreferences.Editor edit = m20482j().edit();
        edit.putLong(str, l.longValue());
        edit.commit();
    }

    /* renamed from: r */
    public static void m20474r(String str, String str2) {
        SharedPreferences.Editor edit = m20482j().edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* renamed from: s */
    public static void m20473s(boolean z) {
        m20477o("KEY_EXCEPTION_EXIT_ROOM_OR_RESTART", z);
    }

    /* renamed from: t */
    public static void m20472t(boolean z) {
        m20477o("KEY_OPEN_MIC_IN_ROOM", z);
    }

    /* renamed from: u */
    public static void m20471u(String str) {
        m20474r("KEY_LAST_ENTER_ROOM_ID", str);
    }

    /* renamed from: v */
    public static void m20470v(Integer num) {
        m20476p("KEY_LAST_ENTER_ROOM_ON_SEAT", num.intValue());
    }

    /* renamed from: w */
    public static void m20469w(String str) {
        m20474r("TEMP_LOG_FIRST_SEARCH", str);
    }

    /* renamed from: x */
    public static void m20468x(boolean z) {
        m20477o("VIDEO_CHAT_CREATE_ROOM", z);
    }

    /* renamed from: y */
    public static void m20467y(Long l) {
        m20475q("VIDEO_CHAT_MY_ROOM_ID", l);
    }

    /* renamed from: z */
    public static void m20466z(String str) {
        m20474r("KEY_OPEN_AD_WELCOME", str);
    }
}
