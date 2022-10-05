'use strict';

/**
 * Teedy application.
 */
angular.module('docs',
    // Dependencies
    ['ui.router', 'ui.bootstrap', 'dialog', 'ngProgress', 'monospaced.qrcode', 'yaru22.angular-timeago', 'ui.validate',
      'ui.sortable', 'restangular', 'ngSanitize', 'ngTouch', 'colorpicker.module', 'ngFileUpload', 'pascalprecht.translate',
      'tmh.dynamicLocale', 'ngOnboarding']
  )

/**
 * Configuring modules.
 */
.config(function($locationProvider, $urlRouterProvider, $stateProvider, $httpProvider, $qProvider,
                 RestangularProvider, $translateProvider, timeAgoSettings, tmhDynamicLocaleProvider) {
  $locationProvider.hashPrefix('');

  // Configuring UI Router
  $stateProvider
    .state('main', {
      url: '',
      views: {
        'page': {
          templateUrl: 'partial/docs/main.html',
          controller: 'Main'
        }
      }
    })
    .state('passwordreset', {
      url: '/passwordreset/:key',
      views: {
        'page': {
          templateUrl: 'partial/docs/passwordreset.html',
          controller: 'PasswordReset'
        }
      }
    })
    .state('tag', {
      url: '/tag',
      abstract: true,
      views: {
        'page': {
          templateUrl: 'partial/docs/tag.html',
          controller: 'Tag'
        }
      }
    })
    .state('tag.default', {
      url: '',
      views: {
        'tag': {
          templateUrl: 'partial/docs/tag.default.html'
        }
      }
    })
    .state('tag.edit', {
      url: '/:id',
      views: {
        'tag': {
          templateUrl: 'partial/docs/tag.edit.html',
          controller: 'TagEdit'
        }
      }
    })
    .state('settings', {
      url: '/settings',
      abstract: true,
      views: {
        'page': {
          templateUrl: 'partial/docs/settings.html',
          controller: 'Settings'
        }
      }
    })
    .state('settings.default', {
      url: '',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.default.html',
          controller: 'SettingsDefault'
        }
      }
    })
    .state('settings.account', {
      url: '/account',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.account.html',
          controller: 'SettingsAccount'
        }
      }
    })
    .state('settings.security', {
      url: '/security',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.security.html',
          controller: 'SettingsSecurity'
        }
      }
    })
    .state('settings.session', {
      url: '/session',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.session.html',
          controller: 'SettingsSession'
        }
      }
    })
    .state('settings.fileimporter', {
      url: '/fileimporter',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.fileimporter.html'
        }
      }
    })
    .state('settings.monitoring', {
      url: '/monitoring',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.monitoring.html',
          controller: 'SettingsMonitoring'
        }
      }
    })
    .state('settings.config', {
      url: '/config',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.config.html',
          controller: 'SettingsConfig'
        }
      }
    })
    .state('settings.inbox', {
      url: '/inbox',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.inbox.html',
          controller: 'SettingsInbox'
        }
      }
    })
    .state('settings.metadata', {
      url: '/metadata',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.metadata.html',
          controller: 'SettingsMetadata'
        }
      }
    })
    .state('settings.user', {
      url: '/user',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.user.html',
          controller: 'SettingsUser'
        }
      }
    })
    .state('settings.user.edit', {
      url: '/edit/:username',
      views: {
        'user': {
          templateUrl: 'partial/docs/settings.user.edit.html',
          controller: 'SettingsUserEdit'
        }
      }
    })
    .state('settings.user.add', {
      url: '/add',
      views: {
        'user': {
          templateUrl: 'partial/docs/settings.user.edit.html',
          controller: 'SettingsUserEdit'
        }
      }
    })
    .state('settings.workflow', {
      url: '/workflow',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.workflow.html',
          controller: 'SettingsWorkflow'
        }
      }
    })
    .state('settings.workflow.edit', {
      url: '/edit/:id',
      views: {
        'workflow': {
          templateUrl: 'partial/docs/settings.workflow.edit.html',
          controller: 'SettingsWorkflowEdit'
        }
      }
    })
    .state('settings.workflow.add', {
      url: '/add',
      views: {
        'workflow': {
          templateUrl: 'partial/docs/settings.workflow.edit.html',
          controller: 'SettingsWorkflowEdit'
        }
      }
    })
    .state('settings.group', {
      url: '/group',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.group.html',
          controller: 'SettingsGroup'
        }
      }
    })
    .state('settings.group.edit', {
      url: '/edit/:name',
      views: {
        'group': {
          templateUrl: 'partial/docs/settings.group.edit.html',
          controller: 'SettingsGroupEdit'
        }
      }
    })
    .state('settings.group.add', {
      url: '/add',
      views: {
        'group': {
          templateUrl: 'partial/docs/settings.group.edit.html',
          controller: 'SettingsGroupEdit'
        }
      }
    })
    .state('settings.vocabulary', {
      url: '/vocabulary',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.vocabulary.html',
          controller: 'SettingsVocabulary'
        }
      }
    })
    .state('settings.ldap', {
      url: '/ldap',
      views: {
        'settings': {
          templateUrl: 'partial/docs/settings.ldap.html',
          controller: 'SettingsLdap'
        }
      }
    })
    .state('document', {
      url: '/document',
      abstract: true,
      views: {
        'page': {
          templateUrl: 'partial/docs/document.html',
          controller: 'Document'
        }
      }
    })
    .state('document.default', {
      url: '',
      views: {
        'document': {
          templateUrl: 'partial/docs/document.default.html',
          controller: 'DocumentDefault'
        }
      }
    })
    .state('document.default.search', {
      url: '/search/:search'
    })
    .state('document.default.file', {
      url: '/file/:fileId',
      views: {
        'file': {
          controller: 'FileView'
        }
      }
    })
    .state('document.add', {
      url: '/add?files',
      views: {
        'document': {
          templateUrl: 'partial/docs/document.edit.html',
          controller: 'DocumentEdit'
        }
      }
    })
    .state('document.edit', {
      url: '/edit/:id?files',
      views: {
        'document': {
          templateUrl: 'partial/docs/document.edit.html',
          controller: 'DocumentEdit'
        }
      }
    })
    .state('document.view', {
      url: '/view/:id',
      redirectTo: 'document.view.content',
      views: {
        'document': {
          templateUrl: 'partial/docs/document.view.html',
          controller: 'DocumentView'
        }
      }
    })
    .state('document.view.content', {
      url: '/content',
      views: {
        'tab': {
          templateUrl: 'partial/docs/document.view.content.html',
          controller: 'DocumentViewContent'
        }
      }
    })
    .state('document.view.workflow', {
      url: '/workflow',
      views: {
        'tab': {
          templateUrl: 'partial/docs/document.view.workflow.html',
          controller: 'DocumentViewWorkflow'
        }
      }
    })
    .state('document.view.content.file', {
      url: '/file/:fileId',
      views: {
        'file': {
          controller: 'FileView'
        }
      }
    })
    .state('document.view.permissions', {
      url: '/permissions',
      views: {
        'tab': {
          templateUrl: 'partial/docs/document.view.permissions.html',
          controller: 'DocumentViewPermissions'
        }
      }
    })
    .state('document.view.activity', {
      url: '/activity',
      views: {
        'tab': {
          templateUrl: 'partial/docs/document.view.activity.html',
          controller: 'DocumentViewActivity'
        }
      }
    })
    .state('login', {
      url: '/login?redirectState&redirectParams',
      views: {
        'page': {
          templateUrl: 'partial/docs/login.html',
          controller: 'Login'
        }
      }
    })
    .state('user', {
      url: '/user',
      abstract: true,
      views: {
        'page': {
          templateUrl: 'partial/docs/usergroup.html',
          controller: 'UserGroup'
        }
      }
    })
    .state('user.default', {
      url: '',
      views: {
        'sub': {
          templateUrl: 'partial/docs/usergroup.default.html'
        }
      }
    })
    .state('user.profile', {
      url: '/:username',
      views: {
        'sub': {
          templateUrl: 'partial/docs/user.profile.html',
          controller: 'UserProfile'
        }
      }
    })
    .state('group', {
      url: '/group',
      abstract: true,
      views: {
        'page': {
          templateUrl: 'partial/docs/usergroup.html',
          controller: 'UserGroup'
        }
      }
    })
    .state('group.default', {
      url: '',
      views: {
        'sub': {
          templateUrl: 'partial/docs/usergroup.default.html'
        }
      }
    })
    .state('group.profile', {
      url: '/:name',
      views: {
        'sub': {
          templateUrl: 'partial/docs/group.profile.html',
          controller: 'GroupProfile'
        }
      }
    });

  // Configuring Restangular
  RestangularProvider.setBaseUrl('../api');

  // Configuring Angular Translate
  $translateProvider
    .useSanitizeValueStrategy('escapeParameters')
    .useStaticFilesLoader({
      prefix: 'locale/',
      suffix: '.json?@build.date@'
    })
    .registerAvailableLanguageKeys(['en', 'es', 'fr', 'de', 'el', 'ru', 'it', 'pl', 'zh_CN', 'zh_TW'], {
      'en_*': 'en',
      'es_*': 'es',
      'fr_*': 'fr',
      'de_*': 'de',
	    'el_*': 'el',
      'ru_*': 'ru',
      'it_*': 'it',
	    'pl_*': 'pl',
      '*': 'en'
    })
    .fallbackLanguage('en');

  if (!_.isUndefined(localStorage.overrideLang)) {
    // Set the current language if an override is saved in local storage
    $translateProvider.use(localStorage.overrideLang);
  } else {
    // Or else determine the language based on the user's browser
    $translateProvider.determinePreferredLanguage();
    if (!$translateProvider.use()) {
      $translateProvider.use('en');
    }
  }

  // Configuring Timago
  timeAgoSettings.fullDateAfterSeconds = 60 * 60 * 24 * 30; // 30 days

  // Configuring tmhDynamicLocale
  tmhDynamicLocaleProvider.localeLocationPattern('locale/angular-locale_{{locale}}.js');

  // Configuring $http to act like jQuery.ajax
  $httpProvider.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=utf-8';
  $httpProvider.defaults.headers.put['Content-Type'] = 'application/x-www-form-urlencoded;charset=utf-8';
  $httpProvider.defaults.headers.delete = {
    'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
  };
  $httpProvider.defaults.transformRequest = [function(data) {
    var param = function(obj) {
      var query = '';
      var name, value, fullSubName, subName, subValue, innerObj, i;
      
      for(name in obj) {
        value = obj[name];
        
        if(value instanceof Array) {
          for(i=0; i<value.length; ++i) {
            subValue = value[i];
            fullSubName = name;
            innerObj = {};
            innerObj[fullSubName] = subValue;
            query += param(innerObj) + '&';
          }
        } else if(value instanceof Object) {
          for(subName in value) {
            subValue = value[subName];
            fullSubName = name + '[' + subName + ']';
            innerObj = {};
            innerObj[fullSubName] = subValue;
            query += param(innerObj) + '&';
          }
        }
        else if(value !== undefined && value !== null) {
          query += encodeURIComponent(name) + '=' + encodeURIComponent(value) + '&';
        }
      }
      
      return query.length ? query.substr(0, query.length - 1) : query;
    };
    
    return angular.isObject(data) && String(data) !== '[object File]' ? param(data) : data;
  }];

  // Silence unhandled rejections
  $qProvider.errorOnUnhandledRejections(false);
})

/**
 * Application initialization.
 */
.run(function($rootScope, $state, $stateParams, Restangular) {
  $rootScope.$state = $state;
  $rootScope.$stateParams = $stateParams;

  // Fetch the current theme configuration
  $rootScope.appName = '';
  Restangular.one('theme').get().then(function(data) {
    $rootScope.appName = data.name;
  });

  // Languages
  $rootScope.acceptedLanguages = [
    { key: 'eng', label: 'English' },
    { key: 'fra', label: 'Français' },
    { key: 'ita', label: 'Italiano' },
    { key: 'deu', label: 'Deutsch' },
    { key: 'spa', label: 'Español' },
    { key: 'por', label: 'Português' },
    { key: 'pol', label: 'Polski' },
    { key: 'rus', label: 'русский' },
    { key: 'ukr', label: 'українська' },
    { key: 'ara', label: 'العربية' },
    { key: 'hin', label: 'हिन्दी' },
    { key: 'chi_sim', label: '简体中文' },
    { key: 'chi_tra', label: '繁体中文' },
    { key: 'jpn', label: '日本語' },
    { key: 'tha', label: 'ภาษาไทย' },
    { key: 'kor', label: '한국어' },
    { key: 'nld', label: 'Nederlands' },
    { key: 'tur', label: 'Türkçe' },
    { key: 'heb', label: 'עברית' },
    { key: 'hun', label: 'Magyar' },
    { key: 'fin', label: 'Suomi' },
    { key: 'swe', label: 'Svenska' },
    { key: 'lav', label: 'Latviešu' },
    { key: 'dan', label: 'Dansk' },
    { key: 'nor', label: 'Norsk' },
    { key: 'vie', label: 'Tiếng Việt' },
    { key: 'ces', label: 'Czech' }
  ];

  // Genders
  $rootScope.acceptedGenders = [
    { key: 'male', label: 'Male' },
    { key: 'female', label: 'Female' },
    { key: 'transgender', label: 'Transgender' },
    { key: 'nonbinary', label: 'Non-binary/non-conforming' },
    { key: 'prefernottorespond', label: 'Prefer Not to Respond' },
  ];

  // Countries
    // Country code: Alpha-3 code https://www.iban.com/country-codes
    // All country ISO codes described in the ISO 3166 international standard.
  $rootScope.acceptedCountries = [
    {key: 'AFG', label: 'Afghanistan' },
    {key: 'ALA', label: 'Åland Islands' },
    {key: 'ALB', label: 'Albania' },
    {key: 'DZA', label: 'Algeria' },
    {key: 'ASM', label: 'American Samoa' },
    {key: 'AND', label: 'Andorra' },
    {key: 'AGO', label: 'Angola' },
    {key: 'AIA', label: 'Anguilla' },
    {key: 'ATA', label: 'Antarctica' },
    {key: 'ATG', label: 'Antigua and Barbuda' },
    {key: 'ARG', label: 'Argentina' },
    {key: 'ARM', label: 'Armenia' },
    {key: 'ABW', label: 'Aruba' },
    {key: 'AUS', label: 'Australia' }, 
    {key: 'AUT', label: 'Austria' },
    {key: 'AZE', label: 'Azerbaijan' },
    {key: 'BHS', label: 'Bahamas' },
    {key: 'BHR', label: 'Bahrain' },
    {key: 'BGD', label: 'Bangladesh' },
    {key: 'BRB', label: 'Barbados' },
    {key: 'BLR', label: 'Belarus' },
    {key: 'BEL', label: 'Belgium' },
    {key: 'BLZ', label: ' Belize' },
    {key: 'BEN', label: 'Benin' },
    {key: 'BMU', label: 'Bermuda' },
    {key: 'BTN', label: 'Bhutan' },
    {key: 'BOL', label: 'Bolivia' },
    {key: 'BES', label: 'Bonaire, Sint Eustatius and Saba' },
    {key: 'BIH', label: 'Bosnia and Herzegovina' },
    {key: 'BWA', label: 'Botswana' },
    {key: 'BVT', label: 'Bouvet Island' },
    {key: 'BRA', label: 'Brazil' },
    {key: 'IOT', label: 'British Indian Ocean Territory' },
    {key: 'BRN', label: 'Brunei Darussalam' },
    {key: 'BGR', label: 'Bulgaria' },
    {key: 'BFA', label: 'Burkina Faso' },
    {key: 'BDI', label: 'Burundi' },
    {key: 'CPV', label: 'Cabo Verde' },
    {key: 'KHM', label: 'Cambodia' },
    {key: 'CMR', label: 'Cameroon' },
    {key: 'CAN', label: 'Canada' },
    {key: 'CYM', label: 'Cayman Islands' },
    {key: 'CAF', label: 'Central African Republic' },
    {key: 'TCD', label: 'Chad' },
    {key: 'CHL', label: 'Chile' },
    {key: 'CHN', label: 'China' },
    {key: 'CXR', label: 'Christmas Island' },
    {key: 'CCK', label: 'Cocos (Keeling) Islands' },
    {key: 'COL', label: 'Colombia' },
    {key: 'COM', label: 'Comoros' },
    {key: 'COG', label: 'Congo' },
    {key: 'COD', label: 'Congo, The Democratic Republic of The' },
    {key: 'COK', label: 'Cook Islands' },
    {key: 'CRI', label: 'Costa Rica' },
    {key: 'CIV', label: 'Côte d\'Ivoire' },
    {key: 'HRV', label: 'Croatia' },
    {key: 'CUW', label: 'Curaçao' },
    {key: 'CUB', label: 'Cuba' },
    {key: 'CYP', label: 'Cyprus' },
    {key: 'CZE', label: 'Czech Republic' },
    {key: 'DNK', label: 'Denmark' },
    {key: 'DJI', label: 'Djibouti' },
    {key: 'DMA', label: 'Dominica' },
    {key: 'DOM', label: 'Dominican Republic' },
    {key: 'ECU', label: 'Ecuador' },
    {key: 'EGY', label: 'Egypt' },
    {key: 'SLV', label: 'El Salvador' },
    {key: 'GNQ', label: 'Equatorial Guinea' },
    {key: 'ERI', label: 'Eritrea' },
    {key: 'EST', label: 'Estonia' },
    {key: 'SWZ', label: 'Eswatini' },
    {key: 'ETH', label: 'Ethiopia' },
    {key: 'FLK', label: 'Falkland Islands (Malvinas)' },
    {key: 'FRO', label: 'Faroe Islands' },
    {key: 'FJI', label: 'Fiji' },
    {key: 'FIN', label: 'Finland' },
    {key: 'FRA', label: 'France' },
    {key: 'GUF', label: 'French Guiana' },
    {key: 'PYF', label: 'French Polynesia' },
    {key: 'ATF', label: 'French Southern Territories' },
    {key: 'GAB', label: 'Gabon' },
    {key: 'GMB', label: 'Gambia' },
    {key: 'GEO', label: 'Georgia' },
    {key: 'DEU', label: 'Germany' },
    {key: 'GHA', label: 'Ghana' },
    {key: 'GIB', label: 'Gibraltar' },
    {key: 'GRC', label: 'Greece' },
    {key: 'GRL', label: 'Greenland' },
    {key: 'GRD', label: 'Grenada' },
    {key: 'GLP', label: 'Guadeloupe' },
    {key: 'GUM', label: 'Guam' },
    {key: 'GTM', label: 'Guatemala' },
    {key: 'GGY', label: 'Guernsey' },
    {key: 'GIN', label: 'Guinea' },
    {key: 'GNB', label: 'Guinea-bissau' },
    {key: 'GUY', label: 'Guyana' },
    {key: 'HTI', label: 'Haiti' },
    {key: 'HMD', label: 'Heard Island and Mcdonald Islands' },
    {key: 'VAT', label: 'Holy See (Vatican City State)' },
    {key: 'HND', label: 'Honduras' },
    {key: 'HKG', label: 'Hong Kong' },
    {key: 'HUN', label: 'Hungary' },
    {key: 'ISL', label: 'Iceland' },
    {key: 'IND', label: 'India' },
    {key: 'IDN', label: 'Indonesia' },
    {key: 'IRN', label: 'Iran, Islamic Republic of' },
    {key: 'IRQ', label: 'Iraq' },
    {key: 'IRL', label: 'Ireland' },
    {key: 'IMN', label: 'Isle of Man' },
    {key: 'ISR', label: 'Israel' },
    {key: 'ITA', label: 'Italy' },
    {key: 'JAM', label: 'Jamaica' },
    {key: 'JPN', label: 'Japan' },
    {key: 'JEY', label: 'Jersey' },
    {key: 'JOR', label: 'Jordan' },
    {key: 'KAZ', label: 'Kazakhstan' },
    {key: 'KEN', label: 'Kenya' },
    {key: 'KIR', label: 'Kiribati' },
    {key: 'PRK', label: 'Korea, Democratic People\'s Republic of' },
    {key: 'KOR, Republic of', label: 'Korea, Republic of' },
    {key: 'KWT', label: 'Kuwait' },
    {key: 'KGZ', label: 'Kyrgyzstan' },
    {key: 'LAO', label: 'Lao, People\'s Democratic Republic of' },
    {key: 'LVA', label: 'Latvia' },
    {key: 'LBN', label: 'Lebanon' },
    {key: 'LSO', label: 'Lesotho' },
    {key: 'LBR', label: 'Liberia' },
    {key: 'LBY', label: 'Libyan Arab Jamahiriya' },
    {key: 'LIE', label: 'Liechtenstein' },
    {key: 'LTU', label: 'Lithuania' },
    {key: 'LUX', label: 'Luxembourg' },
    {key: 'MAC', label: 'Macao' },
    // {key: 'UNDEFINED', label: 'Macedonia, The Former Yugoslav Republic of' },
    {key: 'MDG', label: 'Madagascar' },
    {key: 'MWI', label: 'Malawi' },
    {key: 'MYS', label: 'Malaysia' },
    {key: 'MDV', label: 'Maldives' },
    {key: 'MLI', label: 'Mali' },
    {key: 'MLT', label: 'Malta' },
    {key: 'MHL', label: 'Marshall Islands' },
    {key: 'MTQ', label: 'Martinique' },
    {key: 'MRT', label: 'Mauritania' },
    {key: 'MUS', label: 'Mauritius' },
    {key: 'MYT', label: 'Mayotte' },
    {key: 'MEX', label: 'Mexico' },
    {key: 'FSM', label: 'Micronesia, Federated States of' },
    {key: 'MDA', label: 'Moldova, Republic of' },
    {key: 'MCO', label: 'Monaco' },
    {key: 'MNG', label: 'Mongolia' },
    {key: 'MNE', label: 'Montenegro' },
    {key: 'MSR', label: 'Montserrat' },
    {key: 'MAR', label: 'Morocco' },
    {key: 'MOZ', label: 'Mozambique' },
    {key: 'MMR', label: 'Myanmar' },
    {key: 'NAM', label: 'Namibia' },
    {key: 'NRU', label: 'Nauru' },
    {key: 'NPL', label: 'Nepal' },
    {key: 'NLD', label: 'Netherlands' },
    // {key: 'UNDEFINED', label: 'Netherlands Antilles' },
    {key: 'NCL', label: 'New Caledonia' },
    {key: 'NZL', label: 'New Zealand' },
    {key: 'NIC', label: 'Nicaragua' },
    {key: 'NER', label: 'Niger' },
    {key: 'NGA', label: 'Nigeria' },
    {key: 'NIU', label: 'Niue' },
    {key: 'NFK', label: 'Norfolk Island' },
    {key: 'MNP', label: 'Northern Mariana Islands' },
    {key: 'NOR', label: 'Norway' },
    {key: 'OMN', label: 'Oman' },
    {key: 'PAK', label: 'Pakistan' },
    {key: 'PLW', label: 'Palau' },
    {key: 'PSE', label: 'Palestine, State of' },
    {key: 'PAN', label: 'Panama' },
    {key: 'PNG', label: 'Papua New Guinea' },
    {key: 'PRY', label: 'Paraguay' },
    {key: 'PER', label: 'Peru' },
    {key: 'PHL', label: 'Philippines' },
    {key: 'PCN', label: 'Pitcairn' },
    {key: 'POL', label: 'Poland' },
    {key: 'PRT', label: 'Portugal' },
    {key: 'PRI', label: 'Puerto Rico' },
    {key: 'QAT', label: 'Qatar' },
    {key: 'REU', label: 'Réunion' },
    {key: 'ROU', label: 'Romania' },
    {key: 'RUS', label: 'Russian Federation' },
    {key: 'RWA', label: 'Rwanda' },
    {key: 'BLM', label: 'Saint Barthélemy' },
    {key: 'SHN', label: 'Saint Helena, Ascension and Tristan da Cunha' },
    {key: 'KNA', label: 'Saint Kitts and Nevis' },
    {key: 'LCA', label: 'Saint Lucia' },
    {key: 'SPM', label: 'Saint Pierre and Miquelon' },
    {key: 'MAF', label: 'Saint Martin, French Part' },
    {key: 'VCT', label: 'Saint Vincent and The Grenadines' },
    {key: 'WSM', label: 'Samoa' },
    {key: 'SMR', label: 'San Marino' },
    {key: 'STP', label: 'Sao Tome and Principe' },
    {key: 'SAU', label: 'Saudi Arabia' },
    {key: 'SEN', label: 'Senegal' },
    {key: 'SRB', label: 'Serbia' },
    {key: 'SYC', label: 'Seychelles' },
    {key: 'SLE', label: 'Sierra Leone' },
    {key: 'SGP', label: 'Singapore' },
    {key: 'SXM', label: 'Sint Maarten, Dutch Part' },
    {key: 'SVK', label: 'Slovakia' },
    {key: 'SVN', label: 'Slovenia' },
    {key: 'SLB', label: 'Solomon Islands' },
    {key: 'SOM', label: 'Somalia' },
    {key: 'ZAF', label: 'South Africa' },
    {key: 'SGS', label: 'South Georgia and The South Sandwich Islands' },
    {key: 'SSD', label: 'South Sudan' },
    {key: 'ESP', label: 'Spain' },
    {key: 'LKA', label: 'Sri Lanka' },
    {key: 'SDN', label: 'Sudan' },
    {key: 'SUR', label: 'Suriname' },
    {key: 'SJM', label: 'Svalbard and Jan Mayen' },
    // {key: 'UNDEFINED', label: 'Swaziland' },
    {key: 'SWE', label: 'Sweden' },
    {key: 'CHE', label: 'Switzerland' },
    {key: 'SYRc', label: 'Syrian Arab Republic' },
    {key: 'TWN', label: 'Taiwan' },
    {key: 'TJK', label: 'Tajikistan' },
    {key: 'TZA', label: 'Tanzania, United Republic of' },
    {key: 'THA', label: 'Thailand' },
    {key: 'TLS', label: 'Timor-leste' },
    {key: 'TGO', label: 'Togo' },
    {key: 'TKLu', label: 'Tokelau' },
    {key: 'TON', label: 'Tonga' },
    {key: 'TTO', label: 'Trinidad and Tobago' },
    {key: 'TUN', label: 'Tunisia' },
    {key: 'TUR', label: 'Turkey' },
    {key: 'TKM', label: 'Turkmenistan' },
    {key: 'TCA', label: 'Turks and Caicos Islands' },
    {key: 'TUV', label: 'Tuvalu' },
    {key: 'UGA', label: 'Uganda' },
    {key: 'UKR', label: 'Ukraine' },
    {key: 'ARE', label: 'United Arab Emirates' },
    {key: 'GBR', label: 'United Kingdom' },
    {key: 'USA', label: 'United States' },
    {key: 'UMI', label: 'United States Minor Outlying Islands' },
    {key: 'URY', label: 'Uruguay' },
    {key: 'UZB', label: 'Uzbekistan' },
    {key: 'VUT', label: 'Vanuatu' },
    {key: 'VEN', label: 'Venezuela' },
    {key: 'VNM', label: 'Viet Nam' },
    {key: 'VGB', label: 'Virgin Islands, British' },
    {key: 'VIR', label: 'Virgin Islands, U.S.' },
    {key: 'WLF', label: 'Wallis and Futuna' },
    {key: 'ESH', label: 'Western Sahara' },
    {key: 'TEM', label: 'Yemen' },
    {key: 'ZMB', label: 'Zambia' },
    {key: 'ZWE', label: 'Zimbabwe' }
  ];

  // Races
  $rootScope.acceptedRaces = [
    { key: 'NT', label: 'American Indian or Alaska Native' },
    { key: 'AS', label: 'Asian' },
    { key: 'AF', label: 'Black or African American' },
    { key: 'IS', label: 'Native Hawaiian or Other Pacific Islander' },
    { key: 'WH', label: 'White' },
    { key: 'ES', label: 'Hispanic or Latino' },
    { key: 'MO', label: 'Mixed origins' }
  ];
})
/**
 * Initialize ngProgress.
 */
 .run (function ($rootScope, ngProgressFactory, $http) {
  $rootScope.ngProgress = ngProgressFactory.createInstance();

  // Watch for the number of XHR running
  $rootScope.$watch(function() {
    return $http.pendingRequests.length > 0
  }, function(loading) {
    if (!loading) {
      $rootScope.ngProgress.complete();
    } else {
      $rootScope.ngProgress.start();
    }
  });
})
/**
 * Initialize ngOnboarding.
 */
.run (function ($rootScope) {
  $rootScope.onboardingEnabled = false;
});

if (location.search.indexOf("protractor") > -1) {
  window.name = 'NG_DEFER_BOOTSTRAP!';
}