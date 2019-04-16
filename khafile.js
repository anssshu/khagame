let project = new Project('Pipa');
project.addAssets('Assets/**');
project.addSources('Sources');
project.addLibrary("gamelib");
project.addLibrary("nape");

resolve(project);




