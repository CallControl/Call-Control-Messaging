package dev.octoshrimpy.quik.feature.compose.editing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0082\u000e\u00a2\u0006\n\n\u0002\u0010\u000b\"\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Ldev/octoshrimpy/quik/feature/compose/editing/PhoneNumberPickerAdapter;", "Ldev/octoshrimpy/quik/common/base/QkAdapter;", "Ldev/octoshrimpy/quik/model/PhoneNumber;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "selectedItem", "setSelectedItem", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "selectedItemChanges", "Lio/reactivex/subjects/Subject;", "Ldev/octoshrimpy/quik/extensions/Optional;", "getSelectedItemChanges", "()Lio/reactivex/subjects/Subject;", "onBindViewHolder", "", "holder", "Ldev/octoshrimpy/quik/common/base/QkViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDatasetChanged", "presentation_noAnalyticsRelease"})
public final class PhoneNumberPickerAdapter extends dev.octoshrimpy.quik.common.base.QkAdapter<dev.octoshrimpy.quik.model.PhoneNumber> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.extensions.Optional<java.lang.Long>> selectedItemChanges = null;
    private java.lang.Long selectedItem;
    
    @javax.inject.Inject
    public PhoneNumberPickerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<dev.octoshrimpy.quik.extensions.Optional<java.lang.Long>> getSelectedItemChanges() {
        return null;
    }
    
    private final void setSelectedItem(java.lang.Long value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dev.octoshrimpy.quik.common.base.QkViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.base.QkViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public void onDatasetChanged() {
    }
}