package com.yydcdut.note.model.camera;

import com.yydcdut.note.camera.param.Size;

/**
 * Created by yuyidong on 16/2/3.
 */
public interface ICameraModel {
    void openCamera(String id, OnCameraOpenedCallback callback, int orientation, Size pictureSize);

    void closeCamera();

    boolean isOpen();

    interface OnCameraOpenedCallback {
        void onOpen(IPreviewModel previewModel,ICameraSettingModel cameraSettingModel);

        void onError();
    }

}
