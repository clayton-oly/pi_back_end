const { execSync } = require('child_process');

module.exports = async (req, res) => {
  try {
    const result = execSync('java -jar ./nsg-0.0.1-SNAPSHOT.jar', { encoding: 'utf-8' });
    res.status(200).send(result);
  } catch (error) {
    res.status(500).send(error);
  }
};
