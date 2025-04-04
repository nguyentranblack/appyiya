package com.vptrm.vcvroom.helper;

import androidx.room.RoomDatabase;

/* renamed from: com.vptrm.vcvroom.helper.d */
/* loaded from: classes3.dex */
public enum EnumC9200d {
    JOYPLAY(1000),
    MANGO(1001),
    LIN_XIAN(1002),
    BF_GAME(1003),
    BF_GAME_01(1004),
    FOODCAROUSEL(RoomDatabase.MAX_BIND_PARAMETER_CNT),
    KINGOFWAR(998),
    GREEDY(997),
    FRUIT_MACHINE(996),
    LUDO(995),
    TAROT(994);
    
    private final int code;

    EnumC9200d(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
