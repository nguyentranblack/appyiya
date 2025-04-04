package com.vptrm.vcvroom.model;

/* loaded from: classes3.dex */
public class ConstellationModel {
    private transient boolean isChecked;
    private int resId;

    public ConstellationModel(int i, boolean z) {
        this.resId = i;
        this.isChecked = z;
    }

    public int getResId() {
        return this.resId;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public void setResId(int i) {
        this.resId = i;
    }

    public String toString() {
        return "ConstellationModel{resId=" + this.resId + ", isChecked=" + this.isChecked + '}';
    }
}
