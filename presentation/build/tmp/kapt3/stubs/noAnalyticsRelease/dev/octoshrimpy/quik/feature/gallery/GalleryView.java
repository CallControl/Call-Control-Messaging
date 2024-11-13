package dev.octoshrimpy.quik.feature.gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\b\u0010\b\u001a\u00020\tH&J\f\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H&\u00a8\u0006\u000b"}, d2 = {"Ldev/octoshrimpy/quik/feature/gallery/GalleryView;", "Ldev/octoshrimpy/quik/common/base/QkView;", "Ldev/octoshrimpy/quik/feature/gallery/GalleryState;", "optionsItemSelected", "Lio/reactivex/Observable;", "", "pageChanged", "Ldev/octoshrimpy/quik/model/MmsPart;", "requestStoragePermission", "", "screenTouched", "presentation_noAnalyticsRelease"})
public abstract interface GalleryView extends dev.octoshrimpy.quik.common.base.QkView<dev.octoshrimpy.quik.feature.gallery.GalleryState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> optionsItemSelected();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> screenTouched();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<dev.octoshrimpy.quik.model.MmsPart> pageChanged();
    
    public abstract void requestStoragePermission();
}