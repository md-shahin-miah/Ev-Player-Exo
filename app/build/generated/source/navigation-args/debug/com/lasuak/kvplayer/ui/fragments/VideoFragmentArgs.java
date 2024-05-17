package com.lasuak.kvplayer.ui.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class VideoFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private VideoFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private VideoFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VideoFragmentArgs fromBundle(@NonNull Bundle bundle) {
    VideoFragmentArgs __result = new VideoFragmentArgs();
    bundle.setClassLoader(VideoFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("folderId")) {
      long folderId;
      folderId = bundle.getLong("folderId");
      __result.arguments.put("folderId", folderId);
    } else {
      throw new IllegalArgumentException("Required argument \"folderId\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("folderName")) {
      String folderName;
      folderName = bundle.getString("folderName");
      if (folderName == null) {
        throw new IllegalArgumentException("Argument \"folderName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("folderName", folderName);
    } else {
      throw new IllegalArgumentException("Required argument \"folderName\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VideoFragmentArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    VideoFragmentArgs __result = new VideoFragmentArgs();
    if (savedStateHandle.contains("folderId")) {
      long folderId;
      folderId = savedStateHandle.get("folderId");
      __result.arguments.put("folderId", folderId);
    } else {
      throw new IllegalArgumentException("Required argument \"folderId\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("folderName")) {
      String folderName;
      folderName = savedStateHandle.get("folderName");
      if (folderName == null) {
        throw new IllegalArgumentException("Argument \"folderName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("folderName", folderName);
    } else {
      throw new IllegalArgumentException("Required argument \"folderName\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getFolderId() {
    return (long) arguments.get("folderId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getFolderName() {
    return (String) arguments.get("folderName");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("folderId")) {
      long folderId = (long) arguments.get("folderId");
      __result.putLong("folderId", folderId);
    }
    if (arguments.containsKey("folderName")) {
      String folderName = (String) arguments.get("folderName");
      __result.putString("folderName", folderName);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("folderId")) {
      long folderId = (long) arguments.get("folderId");
      __result.set("folderId", folderId);
    }
    if (arguments.containsKey("folderName")) {
      String folderName = (String) arguments.get("folderName");
      __result.set("folderName", folderName);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    VideoFragmentArgs that = (VideoFragmentArgs) object;
    if (arguments.containsKey("folderId") != that.arguments.containsKey("folderId")) {
      return false;
    }
    if (getFolderId() != that.getFolderId()) {
      return false;
    }
    if (arguments.containsKey("folderName") != that.arguments.containsKey("folderName")) {
      return false;
    }
    if (getFolderName() != null ? !getFolderName().equals(that.getFolderName()) : that.getFolderName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getFolderId() ^ (getFolderId() >>> 32));
    result = 31 * result + (getFolderName() != null ? getFolderName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "VideoFragmentArgs{"
        + "folderId=" + getFolderId()
        + ", folderName=" + getFolderName()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull VideoFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(long folderId, @NonNull String folderName) {
      this.arguments.put("folderId", folderId);
      if (folderName == null) {
        throw new IllegalArgumentException("Argument \"folderName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("folderName", folderName);
    }

    @NonNull
    public VideoFragmentArgs build() {
      VideoFragmentArgs result = new VideoFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setFolderId(long folderId) {
      this.arguments.put("folderId", folderId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setFolderName(@NonNull String folderName) {
      if (folderName == null) {
        throw new IllegalArgumentException("Argument \"folderName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("folderName", folderName);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public long getFolderId() {
      return (long) arguments.get("folderId");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getFolderName() {
      return (String) arguments.get("folderName");
    }
  }
}
