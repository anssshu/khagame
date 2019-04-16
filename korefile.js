let fs = require('fs');
let path = require('path');
let project = new Project('Pipa', __dirname);
project.targetOptions = {"html5":{},"flash":{},"android":{},"ios":{}};
project.setDebugDir('build/android-native');
Promise.all([Project.createProject('build/android-native-build', __dirname), Project.createProject('/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha', __dirname), Project.createProject('/Applications/Kode Studio.app/Contents/Resources/app/extensions/kha/Kha/Kore', __dirname)]).then((projects) => {
	for (let p of projects) project.addSubProject(p);
	let libs = [];
	if (fs.existsSync(path.join('Libraries/gamelib', 'korefile.js'))) {
		libs.push(Project.createProject('Libraries/gamelib', __dirname));
	}
	Promise.all(libs).then((libprojects) => {
		for (let p of libprojects) project.addSubProject(p);
		resolve(project);
	});
});
