package com.vptrm.vcvroom.model;

import p321f5.InterfaceC13619a;

/* loaded from: classes3.dex */
public class LiveTabEntity implements InterfaceC13619a {
    public int selectedIcon;
    public String title;
    public int unSelectedIcon;

    public LiveTabEntity(String str, int i, int i2) {
        this.title = str;
        this.selectedIcon = i;
        this.unSelectedIcon = i2;
    }

    @Override // p321f5.InterfaceC13619a
    public int getTabSelectedIcon() {
        return this.selectedIcon;
    }

    @Override // p321f5.InterfaceC13619a
    public String getTabTitle() {
        return this.title;
    }

    @Override // p321f5.InterfaceC13619a
    public int getTabUnselectedIcon() {
        return this.unSelectedIcon;
    }

    public LiveTabEntity(String str) {
        this.title = str;
    }
}
