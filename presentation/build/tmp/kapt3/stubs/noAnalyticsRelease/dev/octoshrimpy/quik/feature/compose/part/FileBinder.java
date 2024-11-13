package dev.octoshrimpy.quik.feature.compose.part;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/part/FileBinder;", "Ldev/octoshrimpy/quik/feature/compose/part/PartBinder;", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "context", "Landroid/content/Context;", "(Ldev/octoshrimpy/quik/common/util/Colors;Landroid/content/Context;)V", "partLayout", "", "getPartLayout", "()I", "theme", "Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "getTheme", "()Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "setTheme", "(Ldev/octoshrimpy/quik/common/util/Colors$Theme;)V", "bindPart", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "part", "Ldev/octoshrimpy/quik/model/MmsPart;", "message", "Ldev/octoshrimpy/quik/model/Message;", "canGroupWithPrevious", "", "canGroupWithNext", "canBindPart", "presentation_noAnalyticsRelease"})
public final class FileBinder extends dev.octoshrimpy.quik.feature.compose.part.PartBinder {
    private final android.content.Context context = null;
    private final int partLayout = dev.octoshrimpy.quik.R.layout.mms_file_list_item;
    @org.jetbrains.annotations.NotNull
    private dev.octoshrimpy.quik.common.util.Colors.Theme theme;
    
    @javax.inject.Inject
    public FileBinder(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors colors, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public int getPartLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.common.util.Colors.Theme getTheme() {
        return null;
    }
    
    @java.lang.Override
    public void setTheme(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors.Theme p0) {
    }
    
    @java.lang.Override
    public boolean canBindPart(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.MmsPart part) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override
    public void bindPart(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.base.QkViewHolder holder, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.MmsPart part, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.Message message, boolean canGroupWithPrevious, boolean canGroupWithNext) {
    }
}