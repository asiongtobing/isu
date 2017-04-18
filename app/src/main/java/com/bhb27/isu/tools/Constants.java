/*
 * Copyright (C) 2016 Felipe de Leon
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bhb27.isu.tools;

public interface Constants {

    String TAG = "iSu";
    String PREF_NAME = "pref";
    String bin_su = "/system/bin/su";
    String xbin_su = "/system/xbin/su";

    String init_superuser = "superuser42";
    String init_restart = "restart42";
    //TODO Always Update supersu init  when change below
    String patchN = "isupatch42";
    String patchM = "isupatch42";

    String GETENFORCE = "getenforce";
    String SETENFORCE = "setenforce";

    String sepolicy = "supolicy --live \"allow untrusted_app superuser_device:sock_file { write }\" \"allow untrusted_app sudaemon:unix_stream_socket { connectto }\" \"allow untrusted_app anr_data_file:dir { read }\" \"allow untrusted_app system_data_file:file { getattr open read }\" \"allow untrusted_app su_exec:file { execute write getattr setattr execute_no_trans }\";";

    String YES_ACTION = "YES_ACTION";
    String DISSMISS_ACTION = "DISSMISS_ACTION";

    String BUILD_PROP = "system/build.prop";

    String PAY = "com.google.android.apps.walletnfcrel";

    String SAFEFINGERPRINT = "google/shamu/shamu:7.1.1/N6F26U/3687496:user/release-keys";
    String robuildfingerprint = "ro.build.fingerprint";

    String[] props = new String[] {
        "ro.build.tags",
        "ro.debuggable",
        "ro.boot.bl_state",
        "ro.boot.flash.locked",
        "ro.boot.verifiedbootstate",
        "ro.secure",
        "ro.boot.veritymode",
        "ro.build.type",
        "ro.build.selinux",
        "ro.boot.selinux"
    };

    String[] props_OK = new String[] {
        "release-keys",
        "0",
        "0",
        "1",
        "green",
        "1",
        "enforcing",
        "user",
        "1",
        "enforcing"
    };

    String[] props_NOK = new String[] {
        "test-keys",
        "1",
        "2",
        "0",
        "orange",
        "0",
        "logging",
        "userdebug",
        "0",
        "permissive"
    };
}
