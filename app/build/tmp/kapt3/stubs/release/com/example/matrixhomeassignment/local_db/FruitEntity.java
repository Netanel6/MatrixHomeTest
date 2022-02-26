package com.example.matrixhomeassignment.local_db;

import java.lang.System;

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
@androidx.room.Entity(tableName = "fruit", primaryKeys = {"fruitName", "fruitImage"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/example/matrixhomeassignment/local_db/FruitEntity;", "", "fruitName", "", "fruitImage", "fruitDesc", "fruitPrice", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getFruitDesc", "()Ljava/lang/String;", "setFruitDesc", "(Ljava/lang/String;)V", "getFruitImage", "setFruitImage", "getFruitName", "setFruitName", "getFruitPrice", "()I", "setFruitPrice", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class FruitEntity {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fruit_name")
    private java.lang.String fruitName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fruit_image")
    private java.lang.String fruitImage;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fruit_desc")
    private java.lang.String fruitDesc;
    @com.google.gson.annotations.SerializedName(value = "fruit_price")
    private int fruitPrice;
    
    /**
     * Created by Netanel Amar on 24/02/2022.
     * NetanelCA2@gmail.com
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.matrixhomeassignment.local_db.FruitEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String fruitName, @org.jetbrains.annotations.NotNull()
    java.lang.String fruitImage, @org.jetbrains.annotations.NotNull()
    java.lang.String fruitDesc, int fruitPrice) {
        return null;
    }
    
    /**
     * Created by Netanel Amar on 24/02/2022.
     * NetanelCA2@gmail.com
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by Netanel Amar on 24/02/2022.
     * NetanelCA2@gmail.com
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public FruitEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String fruitName, @org.jetbrains.annotations.NotNull()
    java.lang.String fruitImage, @org.jetbrains.annotations.NotNull()
    java.lang.String fruitDesc, int fruitPrice) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFruitName() {
        return null;
    }
    
    public final void setFruitName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFruitImage() {
        return null;
    }
    
    public final void setFruitImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFruitDesc() {
        return null;
    }
    
    public final void setFruitDesc(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getFruitPrice() {
        return 0;
    }
    
    public final void setFruitPrice(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}