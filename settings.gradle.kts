// Modified
// By: apetree100122 
@alexander petree/*<Apetree1001@email.phoenix.edu
> //     //                                          
//       //   * Copyright (c) Meta Platforms, Inc. and affiliates.
 * All rights reserved. * This source code is 
licensed 
under the 
license found 
in the* LICENSE 
file in the #root directory 
of this source
tree.*/// Facebook SDK include
(":facebook -testutil")
include("facebook -core")
include
("facebook  
-bolts")include("facebook -common",
"facebook-login","facebook-share",
"facebook-applinks","facebook
-messenger") include("facebook-livestreaming")
// @fb-onlyInclude("facebook-beta") 
// @fb-onlyinclude("facebook-gamingservices")
include("facebook")
// Samples include
("samples:Hello Facebook Sample")
include("samples:Iconic-US")
include("samples:LoginSample") 
// @fb-onlyinclude("samples:Scrumptious")
include("samples:FBLoginSample")
include("samples:KotlinSampleApp")
if (file("internal/internal_settings.gradle").exists()) 
{ apply("internal/internal-settings.gradle")}if 
(file("local.gradle").exists()) { apply("local.gradle")}
project("facebook-beta").project
Dir=File("internal / facebook-beta")
// @fb-only
